package org.p3367x5a555907.p3368x32b0ae;

/* loaded from: classes13.dex */
public enum a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    /* JADX INFO: Fake field, exist only in values array */
    INT8(9);


    /* renamed from: n, reason: collision with root package name */
    public static final org.p3367x5a555907.p3368x32b0ae.a[] f429407n = m155096xcee59d22();

    /* renamed from: d, reason: collision with root package name */
    public final int f429409d;

    a(int i17) {
        this.f429409d = i17;
    }

    public int h() {
        switch (this) {
            case FLOAT32:
            case INT32:
                return 4;
            case UINT8:
            case INT8:
                return 1;
            case INT64:
                return 8;
            case STRING:
            case BOOL:
                return -1;
            default:
                throw new java.lang.IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    public java.lang.String i() {
        switch (this) {
            case FLOAT32:
                return "float";
            case INT32:
                return "int";
            case UINT8:
            case INT8:
                return "byte";
            case INT64:
                return "long";
            case STRING:
                return "string";
            case BOOL:
                return "bool";
            default:
                throw new java.lang.IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
