package ey4;

/* loaded from: classes8.dex */
public class d implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey4.e f339148d;

    public d(ey4.e eVar) {
        this.f339148d = eVar;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        ey4.e eVar = this.f339148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = eVar.f339149d;
        ey4.i iVar = c19493xb618544c.f268810d;
        if (iVar != null) {
            c19493xb618544c.f268818o.getText().toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.f0) iVar).f263740a;
            e0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c2 = e0Var.f263721v;
            if (c19493xb618544c2 != null) {
                c19493xb618544c2.a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c3 = eVar.f339149d;
        c19493xb618544c3.f268818o.clearComposingText();
        c19493xb618544c3.f268818o.setText("");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f339148d.f339149d.f268821r;
        if (abstractActivityC21394xb3d2c0cf != null) {
            dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, "exceed max-length", 0).show();
        }
    }
}
