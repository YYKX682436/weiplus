package j93;

/* loaded from: classes.dex */
public final class c0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.g0 f379898d;

    public c0(j93.g0 g0Var) {
        this.f379898d = g0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f544710a : null) == ym3.p.f544714f) {
            j93.g0 g0Var = this.f379898d;
            java.lang.String stringExtra = g0Var.m158359x1e885992().getStringExtra("label_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) g0Var.f379923d).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 == null || (arrayList2 = a17.f233598o) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ri5.j) it.next()).f477644f);
                }
            }
            int size = arrayList.size();
            java.lang.String str = stringExtra + '(' + size + ')';
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelTitleViewUIC", " size:" + size + " labelName:" + stringExtra + " labelId:" + ((java.lang.String) ((jz5.n) g0Var.f379924e).mo141623x754a37bb()));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g0Var.m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(str);
            }
        }
    }
}
