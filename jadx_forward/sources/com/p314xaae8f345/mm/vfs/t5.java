package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.a0 f294720a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f294721b;

    public t5(com.p314xaae8f345.mm.vfs.a0 a0Var) {
        this.f294720a = a0Var;
    }

    public java.lang.Object a(java.util.Map map, java.lang.String str) {
        if (this.f294721b == null) {
            this.f294721b = this.f294720a.b(map);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.FileSystemManager", "configure: " + str + " => " + this.f294721b);
        }
        return this.f294721b;
    }

    /* renamed from: equals */
    public boolean m82471xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.t5) {
            if (this.f294720a.equals(((com.p314xaae8f345.mm.vfs.t5) obj).f294720a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82472x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.t5.class.hashCode() ^ this.f294720a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m82473x9616526c() {
        com.p314xaae8f345.mm.vfs.a0 a0Var = this.f294720a;
        return a0Var == null ? "[NULL]" : a0Var.toString();
    }

    public t5(com.p314xaae8f345.mm.vfs.t5 t5Var) {
        this.f294720a = t5Var.f294720a;
        this.f294721b = null;
    }
}
