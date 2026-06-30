package com.google.protobuf;

/* loaded from: classes16.dex */
public class z9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f45805d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45806e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f45807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.ba f45808g;

    public z9(com.google.protobuf.ba baVar, com.google.protobuf.u9 u9Var) {
        this.f45808g = baVar;
    }

    public final java.util.Iterator a() {
        if (this.f45807f == null) {
            this.f45807f = this.f45808g.f44932f.entrySet().iterator();
        }
        return this.f45807f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f45805d + 1;
        com.google.protobuf.ba baVar = this.f45808g;
        if (i17 >= baVar.f44931e.size()) {
            return !baVar.f44932f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        this.f45806e = true;
        int i17 = this.f45805d + 1;
        this.f45805d = i17;
        com.google.protobuf.ba baVar = this.f45808g;
        return i17 < baVar.f44931e.size() ? (java.util.Map.Entry) baVar.f44931e.get(this.f45805d) : (java.util.Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f45806e) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f45806e = false;
        int i17 = com.google.protobuf.ba.f44929m;
        com.google.protobuf.ba baVar = this.f45808g;
        baVar.b();
        if (this.f45805d >= baVar.f44931e.size()) {
            a().remove();
            return;
        }
        int i18 = this.f45805d;
        this.f45805d = i18 - 1;
        baVar.i(i18);
    }
}
