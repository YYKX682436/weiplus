package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public final class DynamicOutputStream extends com.qq.taf.jce.JceOutputStream {
    public DynamicOutputStream(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public void write(com.qq.taf.jce.dynamic.JceField jceField) {
        int tag = jceField.getTag();
        int i17 = 0;
        if (jceField instanceof com.qq.taf.jce.dynamic.ZeroField) {
            write(0, tag);
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.IntField) {
            write(((com.qq.taf.jce.dynamic.IntField) jceField).get(), tag);
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.ShortField) {
            write(((com.qq.taf.jce.dynamic.ShortField) jceField).get(), tag);
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.ByteField) {
            write(((com.qq.taf.jce.dynamic.ByteField) jceField).get(), tag);
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.StringField) {
            write(((com.qq.taf.jce.dynamic.StringField) jceField).get(), tag);
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.ByteArrayField) {
            write(((com.qq.taf.jce.dynamic.ByteArrayField) jceField).get(), tag);
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.ListField) {
            com.qq.taf.jce.dynamic.ListField listField = (com.qq.taf.jce.dynamic.ListField) jceField;
            reserve(8);
            writeHead((byte) 9, tag);
            write(listField.size(), 0);
            com.qq.taf.jce.dynamic.JceField[] jceFieldArr = listField.get();
            int length = jceFieldArr.length;
            while (i17 < length) {
                write(jceFieldArr[i17]);
                i17++;
            }
            return;
        }
        if (jceField instanceof com.qq.taf.jce.dynamic.MapField) {
            com.qq.taf.jce.dynamic.MapField mapField = (com.qq.taf.jce.dynamic.MapField) jceField;
            reserve(8);
            writeHead((byte) 8, tag);
            int size = mapField.size();
            write(size, 0);
            while (i17 < size) {
                write(mapField.getKey(i17));
                write(mapField.getValue(i17));
                i17++;
            }
            return;
        }
        if (!(jceField instanceof com.qq.taf.jce.dynamic.StructField)) {
            if (jceField instanceof com.qq.taf.jce.dynamic.LongField) {
                write(((com.qq.taf.jce.dynamic.LongField) jceField).get(), tag);
                return;
            } else if (jceField instanceof com.qq.taf.jce.dynamic.FloatField) {
                write(((com.qq.taf.jce.dynamic.FloatField) jceField).get(), tag);
                return;
            } else {
                if (!(jceField instanceof com.qq.taf.jce.dynamic.DoubleField)) {
                    throw new com.qq.taf.jce.JceDecodeException("unknow JceField type: ".concat(jceField.getClass().getName()));
                }
                write(((com.qq.taf.jce.dynamic.DoubleField) jceField).get(), tag);
                return;
            }
        }
        reserve(2);
        writeHead((byte) 10, tag);
        com.qq.taf.jce.dynamic.JceField[] jceFieldArr2 = ((com.qq.taf.jce.dynamic.StructField) jceField).get();
        for (com.qq.taf.jce.dynamic.JceField jceField2 : jceFieldArr2) {
            write(jceField2);
        }
        reserve(2);
        writeHead((byte) 11, 0);
    }

    public DynamicOutputStream(int i17) {
        super(i17);
    }

    public DynamicOutputStream() {
    }
}
