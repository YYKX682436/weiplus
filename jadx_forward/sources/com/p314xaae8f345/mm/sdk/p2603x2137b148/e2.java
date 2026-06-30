package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f274080a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f274081b;

    public byte[] a() {
        if (!this.f274081b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        b(1);
        this.f274080a.put((byte) 125);
        int position = this.f274080a.position();
        byte[] bArr = new byte[position];
        java.lang.System.arraycopy(this.f274080a.array(), 0, bArr, 0, position);
        return bArr;
    }

    public final int b(int i17) {
        if (this.f274080a.limit() - this.f274080a.position() > i17) {
            return 0;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(this.f274080a.limit() + 4096);
        allocate.put(this.f274080a.array(), 0, this.f274080a.position());
        this.f274080a = allocate;
        return 0;
    }

    public boolean c() {
        return this.f274080a.limit() - this.f274080a.position() <= 1;
    }

    public byte[] d() {
        if (this.f274081b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        int i17 = this.f274080a.getShort();
        if (i17 > 1048576) {
            this.f274080a = null;
            throw new java.lang.Exception("Buffer String Length Error");
        }
        if (i17 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i17];
        this.f274080a.get(bArr, 0, i17);
        return bArr;
    }

    public int e() {
        if (this.f274081b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        return this.f274080a.getInt();
    }

    public long f() {
        if (this.f274081b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        return this.f274080a.getLong();
    }

    public java.lang.String g() {
        if (this.f274081b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        int i17 = this.f274080a.getShort();
        if (i17 > 1048576) {
            this.f274080a = null;
            throw new java.lang.Exception("Buffer String Length Error");
        }
        if (i17 == 0) {
            return "";
        }
        byte[] bArr = new byte[i17];
        this.f274080a.get(bArr, 0, i17);
        return new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
    }

    public int h() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4096);
        this.f274080a = allocate;
        allocate.put((byte) 123);
        this.f274081b = true;
        return 0;
    }

    public int i(byte[] bArr) {
        if (((bArr == null || bArr.length == 0) ? (char) 65535 : bArr[0] != 123 ? (char) 65534 : bArr[bArr.length + (-1)] != 125 ? (char) 65533 : (char) 0) != 0) {
            this.f274080a = null;
            return -1;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        this.f274080a = wrap;
        wrap.position(1);
        this.f274081b = false;
        return 0;
    }

    public int j(byte[] bArr) {
        if (!this.f274081b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        if (bArr == null) {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length > 1048576) {
            throw new java.lang.Exception("Buffer String Length Error");
        }
        b(bArr.length + 2);
        this.f274080a.putShort((short) bArr.length);
        if (bArr.length > 0) {
            this.f274080a.put(bArr);
        }
        return 0;
    }

    public int k(int i17) {
        if (!this.f274081b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        b(4);
        this.f274080a.putInt(i17);
        return 0;
    }

    public int l(long j17) {
        if (!this.f274081b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        b(8);
        this.f274080a.putLong(j17);
        return 0;
    }

    public int m(java.lang.String str) {
        if (!this.f274081b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        byte[] bytes = str != null ? str.getBytes() : null;
        if (bytes == null) {
            bytes = new byte[0];
        }
        if (bytes.length > 1048576) {
            throw new java.lang.Exception("Buffer String Length Error");
        }
        b(bytes.length + 2);
        this.f274080a.putShort((short) bytes.length);
        if (bytes.length > 0) {
            this.f274080a.put(bytes);
        }
        return 0;
    }

    public void n(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f274080a;
        byteBuffer.position(i17 + byteBuffer.position());
    }

    public void o() {
        if (this.f274081b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        short s17 = this.f274080a.getShort();
        if (s17 > 1048576) {
            this.f274080a = null;
            throw new java.lang.Exception("Buffer String Length Error");
        }
        if (s17 == 0) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = this.f274080a;
        byteBuffer.position(byteBuffer.position() + s17);
    }
}
