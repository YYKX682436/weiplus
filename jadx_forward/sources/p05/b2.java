package p05;

/* loaded from: classes10.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f431992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f431993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p05.d2 d2Var, int i17, java.lang.String str) {
        super(0);
        this.f431992d = d2Var;
        this.f431993e = i17;
        this.f431994f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.Object obj;
        p05.x0 x0Var;
        v65.n nVar;
        p05.d2 d2Var = this.f431992d;
        try {
            java.util.Iterator it = d2Var.f432024f.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i17 = this.f431993e;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p05.s1) obj).f432214a == ((long) i17)) {
                    break;
                }
            }
            p05.s1 s1Var = (p05.s1) obj;
            if (s1Var != null) {
                long j17 = s1Var.f432214a;
                int optInt = new org.json.JSONObject(this.f431994f).optInt("animEnd");
                java.util.ArrayList arrayList = d2Var.f432024f;
                if (optInt == 1 || optInt == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " end. remove now");
                    rh0.d0 d0Var = d2Var.f432021c;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).t(j17);
                    }
                    arrayList.remove(s1Var);
                } else if (optInt == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " stage:" + s1Var.f432217d + "->222");
                    s1Var.f432217d = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
                    java.util.Iterator it6 = arrayList.iterator();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
                    while (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                        p05.s1 s1Var2 = (p05.s1) next;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s1Var2.f432215b, s1Var.f432215b)) {
                            break;
                        }
                        rh0.d0 d0Var2 = d2Var.f432021c;
                        if (d0Var2 != null) {
                            ((p05.l4) d0Var2).t(s1Var2.f432214a);
                        }
                        it6.remove();
                    }
                    if (s1Var.f432218e) {
                        rh0.d0 d0Var3 = d2Var.f432021c;
                        if (d0Var3 != null) {
                            ((p05.l4) d0Var3).t(j17);
                        }
                        arrayList.remove(s1Var);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#weVisionJsonCallback done. workingEffectNativeIds.size=" + arrayList.size());
                if (arrayList.isEmpty() && (x0Var = d2Var.f432025g) != null && (nVar = ((tf2.g) x0Var).f500454b) != null) {
                    nVar.a(0);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePkGiftEffect", e17.toString());
        }
        return jz5.f0.f384359a;
    }
}
