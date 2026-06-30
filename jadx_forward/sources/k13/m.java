package k13;

/* loaded from: classes8.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 f384782a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057) {
        this.f384782a = activityC15561x6c397057;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057 = this.f384782a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15561x6c397057.f218865d, "get accept info successfully");
            r45.k43 k43Var = ((r45.su5) fVar.f152151d).f467509d;
            i13.j jVar = new i13.j();
            jVar.f66503x11b86abb = k43Var.f459894i;
            jVar.f66497xc9a553ad = k43Var.f459891f * 1000;
            jVar.f66495x81959a6e = k43Var.f459890e * 1000;
            jVar.f66500xda05eaf7 = !((c01.id.c() > jVar.f66497xc9a553ad ? 1 : (c01.id.c() == jVar.f66497xc9a553ad ? 0 : -1)) >= 0) ? 1 : 0;
            jVar.f66498x89ebb00a = k43Var.f459895m;
            jVar.f66496x685e8417 = k43Var.f459892g;
            jVar.f66502x11b62ca9 = k43Var.f459893h;
            jVar.f66499xaeadb4bb = k43Var.f459889d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15561x6c397057.f218865d, " item:%s", jVar);
            android.widget.TextView textView = (android.widget.TextView) activityC15561x6c397057.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            java.lang.String str = jVar.f66496x685e8417;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        } else {
            dp.a.m125854x26a183b(activityC15561x6c397057, fVar.f152150c, 0).show();
            activityC15561x6c397057.finish();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15561x6c397057.f218867f;
        if (u3Var == null) {
            return null;
        }
        u3Var.dismiss();
        return jz5.f0.f384359a;
    }
}
