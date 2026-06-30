package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f273693a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f273694b;

    /* renamed from: d, reason: collision with root package name */
    public int f273696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Class f273697e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f273699g;

    /* renamed from: c, reason: collision with root package name */
    public boolean f273695c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f273698f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273700h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f273701i = "";

    /* renamed from: toString */
    public java.lang.String m75970x9616526c() {
        int i17 = this.f273696d;
        java.lang.String str = "Unknown";
        if (i17 != 8) {
            switch (i17) {
                case 1:
                    str = "String";
                    break;
                case 2:
                    str = "int";
                    break;
                case 3:
                    str = "long";
                    break;
                case 4:
                    str = "double";
                    break;
                case 5:
                    str = "float";
                    break;
                case 6:
                    str = "ByteString";
                    break;
                case 7:
                    str = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03;
                    break;
                case 8:
                    str = "ProtoBuf";
                    break;
            }
        } else {
            java.lang.Class cls = this.f273697e;
            if (cls != null) {
                str = cls.getSimpleName();
            }
        }
        if (this.f273698f) {
            str = "Map";
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f273695c ? "repeated " : "";
        objArr[1] = this.f273694b;
        objArr[2] = java.lang.Integer.valueOf(this.f273693a);
        objArr[3] = str;
        return java.lang.String.format("%s%s(%s): %s", objArr);
    }
}
