package j93;

/* loaded from: classes11.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.w f380024a;

    public s(j93.w wVar) {
        this.f380024a = wVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = fVar.f152152e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518217m, vg3.b.f518179f, vg3.c.f518201w, fVar.f152149b, null, 16, null));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.c4 c4Var = (r45.c4) fVar.f152151d;
            java.util.LinkedList linkedList = c4Var.f452793e;
            j93.w wVar = this.f380024a;
            if (linkedList == null || linkedList.size() <= 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = wVar.m158354x19263085();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = wVar.f380058d;
                java.lang.String string = wVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571360cv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (f4Var != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = f4Var.f293324d;
                    e4Var.getClass();
                    e4Var.f293309c = string;
                    e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                    e4Var.e();
                } else {
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var2.f293309c = string;
                    e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                    e4Var2.c();
                }
            } else {
                r45.f54 f54Var = (r45.f54) linkedList.get(0);
                java.lang.String str = f54Var.f455554d;
                java.lang.String valueOf = java.lang.String.valueOf(f54Var.f455555e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateNewLabelUIC", "[onSceneEnd] add label pair.LabelID:" + valueOf + " pair.LabelName:" + str);
                java.util.LinkedList linkedList2 = c4Var.f452793e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = linkedList2.size();
                for (int i18 = 0; i18 < size; i18++) {
                    r45.f54 f54Var2 = (r45.f54) linkedList2.get(i18);
                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
                    d4Var.f66585x70ce48ca = f54Var2.f455555e;
                    java.lang.String str2 = f54Var2.f455554d;
                    d4Var.f66586x7661fe9a = str2;
                    d4Var.f66587x68c44467 = x51.k.a(str2);
                    d4Var.f66588xb0759da4 = x51.k.b(f54Var2.f455554d);
                    d4Var.f66584x284d1882 = false;
                    arrayList.add(d4Var);
                }
                b93.r.wi().W0(arrayList);
                b93.r.wi().T1(arrayList);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = wVar.f380058d;
                if (f4Var2 != null) {
                    f4Var2.dismiss();
                }
                f93.q5 q5Var = f93.q5.f341974a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = wVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                q5Var.d(m158354x19263085, valueOf, str);
            }
        }
        return jz5.f0.f384359a;
    }
}
