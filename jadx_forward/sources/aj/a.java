package aj;

/* loaded from: classes15.dex */
public abstract class a {
    public static int a(java.io.InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.EOFException();
    }

    public static long b(java.io.InputStream inputStream) {
        d(inputStream, new byte[8], 0, 8L);
        return (r1[0] << 56) + ((r1[1] & 255) << 48) + ((r1[2] & 255) << 40) + ((r1[3] & 255) << 32) + ((r1[4] & 255) << 24) + ((r1[5] & 255) << 16) + ((r1[6] & 255) << 8) + (r1[7] & 255);
    }

    public static short c(java.io.InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (short) (read2 | (read << 8));
        }
        throw new java.io.EOFException();
    }

    public static void d(java.io.InputStream inputStream, byte[] bArr, int i17, long j17) {
        int i18 = 0;
        while (true) {
            long j18 = i18;
            if (j18 >= j17) {
                return;
            }
            int read = inputStream.read(bArr, i18, (int) (j17 - j18));
            if (read < 0) {
                throw new java.io.EOFException();
            }
            i18 += read;
        }
    }

    public static zi.b e(java.io.InputStream inputStream, int i17) {
        byte[] bArr = new byte[i17];
        d(inputStream, bArr, 0, i17);
        return new zi.b(bArr);
    }

    public static java.lang.Object f(java.io.InputStream inputStream, zi.c cVar, int i17) {
        switch (cVar) {
            case OBJECT:
                return e(inputStream, i17);
            case BOOLEAN:
                return java.lang.Boolean.valueOf(inputStream.read() != 0);
            case CHAR:
                return java.lang.Character.valueOf((char) c(inputStream));
            case FLOAT:
                return java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(a(inputStream)));
            case DOUBLE:
                return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(b(inputStream)));
            case BYTE:
                return java.lang.Byte.valueOf((byte) inputStream.read());
            case SHORT:
                return java.lang.Short.valueOf(c(inputStream));
            case INT:
                return java.lang.Integer.valueOf(a(inputStream));
            case LONG:
                return java.lang.Long.valueOf(b(inputStream));
            default:
                return null;
        }
    }

    public static void g(java.io.InputStream inputStream, long j17) {
        long j18 = 0;
        while (j18 < j17) {
            long skip = inputStream.skip(j17 - j18);
            if (skip < 0) {
                throw new java.io.EOFException();
            }
            j18 += skip;
        }
    }

    public static void h(java.io.OutputStream outputStream, long j17) {
        byte[] bArr = new byte[4096];
        for (int i17 = 0; i17 < (j17 >> 12); i17++) {
            outputStream.write(bArr);
        }
        outputStream.write(bArr, 0, (int) (j17 & 4095));
    }

    public static void i(java.io.OutputStream outputStream, int i17) {
        outputStream.write((i17 >>> 24) & 255);
        outputStream.write((i17 >>> 16) & 255);
        outputStream.write((i17 >>> 8) & 255);
        outputStream.write(i17 & 255);
    }

    public static void j(java.io.OutputStream outputStream, long j17) {
        outputStream.write(new byte[]{(byte) (j17 >>> 56), (byte) (j17 >>> 48), (byte) (j17 >>> 40), (byte) (j17 >>> 32), (byte) (j17 >>> 24), (byte) (j17 >>> 16), (byte) (j17 >>> 8), (byte) j17}, 0, 8);
    }

    public static void k(java.io.OutputStream outputStream, int i17) {
        outputStream.write((i17 >>> 8) & 255);
        outputStream.write(i17 & 255);
    }

    public static void l(java.io.OutputStream outputStream, java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("value is null.");
        }
        if (obj instanceof zi.b) {
            outputStream.write(((zi.b) obj).f554609a);
            return;
        }
        if ((obj instanceof java.lang.Boolean) || java.lang.Boolean.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if ((obj instanceof java.lang.Character) || java.lang.Character.TYPE.isAssignableFrom(obj.getClass())) {
            k(outputStream, ((java.lang.Character) obj).charValue());
            return;
        }
        if ((obj instanceof java.lang.Float) || java.lang.Float.TYPE.isAssignableFrom(obj.getClass())) {
            i(outputStream, java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
            return;
        }
        if ((obj instanceof java.lang.Double) || java.lang.Double.TYPE.isAssignableFrom(obj.getClass())) {
            j(outputStream, java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
            return;
        }
        if ((obj instanceof java.lang.Byte) || java.lang.Byte.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((java.lang.Byte) obj).byteValue());
            return;
        }
        if ((obj instanceof java.lang.Short) || java.lang.Short.TYPE.isAssignableFrom(obj.getClass())) {
            k(outputStream, ((java.lang.Short) obj).shortValue());
            return;
        }
        if ((obj instanceof java.lang.Integer) || java.lang.Integer.TYPE.isAssignableFrom(obj.getClass())) {
            i(outputStream, ((java.lang.Integer) obj).intValue());
        } else {
            if (!(obj instanceof java.lang.Long) && !java.lang.Long.TYPE.isAssignableFrom(obj.getClass())) {
                throw new java.lang.IllegalArgumentException("bad value type: ".concat(obj.getClass().getName()));
            }
            j(outputStream, ((java.lang.Long) obj).longValue());
        }
    }
}
