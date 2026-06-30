package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class h2 extends com.p314xaae8f345.p3210x3857dc.z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f268777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f268778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2 f268779c;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2 p2Var, com.p314xaae8f345.p3210x3857dc.z zVar) {
        this.f268779c = p2Var;
        this.f268778b = zVar;
        p2Var.f269026d.add(this);
        this.f268777a = false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void a() {
        if (!this.f268777a) {
            this.f268778b.a();
            this.f268777a = true;
        }
        this.f268779c.f269026d.remove(this);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void b() {
        if (!this.f268777a) {
            this.f268778b.b();
            this.f268777a = true;
        }
        this.f268779c.f269026d.remove(this);
    }
}
