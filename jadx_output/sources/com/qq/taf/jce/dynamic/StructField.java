package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class StructField extends com.qq.taf.jce.dynamic.JceField {
    private static final java.util.Comparator<com.qq.taf.jce.dynamic.JceField> tagComp = new java.util.Comparator<com.qq.taf.jce.dynamic.JceField>() { // from class: com.qq.taf.jce.dynamic.StructField.1
        @Override // java.util.Comparator
        public int compare(com.qq.taf.jce.dynamic.JceField jceField, com.qq.taf.jce.dynamic.JceField jceField2) {
            return jceField.getTag() - jceField2.getTag();
        }
    };
    private com.qq.taf.jce.dynamic.JceField[] data;

    public StructField(com.qq.taf.jce.dynamic.JceField[] jceFieldArr, int i17) {
        super(i17);
        this.data = jceFieldArr;
    }

    public com.qq.taf.jce.dynamic.JceField[] get() {
        return this.data;
    }

    public com.qq.taf.jce.dynamic.JceField getFieldByTag(int i17) {
        int binarySearch = java.util.Arrays.binarySearch(this.data, com.qq.taf.jce.dynamic.JceField.createZero(i17), tagComp);
        if (binarySearch >= 0) {
            return this.data[binarySearch];
        }
        return null;
    }

    public boolean setByTag(int i17, com.qq.taf.jce.dynamic.JceField jceField) {
        int binarySearch = java.util.Arrays.binarySearch(this.data, com.qq.taf.jce.dynamic.JceField.createZero(i17), tagComp);
        if (binarySearch >= 0) {
            this.data[binarySearch] = jceField;
            return true;
        }
        int i18 = (-binarySearch) - 1;
        com.qq.taf.jce.dynamic.JceField[] jceFieldArr = new com.qq.taf.jce.dynamic.JceField[this.data.length + 1];
        for (int i19 = 0; i19 < i18; i19++) {
            jceFieldArr[i19] = this.data[i19];
        }
        jceFieldArr[i18] = jceField;
        while (true) {
            com.qq.taf.jce.dynamic.JceField[] jceFieldArr2 = this.data;
            if (i18 >= jceFieldArr2.length) {
                return false;
            }
            int i27 = i18 + 1;
            jceFieldArr[i27] = jceFieldArr2[i18];
            i18 = i27;
        }
    }
}
