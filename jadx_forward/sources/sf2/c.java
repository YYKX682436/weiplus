package sf2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn2.a f488594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f488598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488599i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f488600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gn2.a aVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Integer num, sf2.x xVar, dk2.yg ygVar) {
        super(3);
        this.f488594d = aVar;
        this.f488595e = i17;
        this.f488596f = str;
        this.f488597g = str2;
        this.f488598h = num;
        this.f488599i = xVar;
        this.f488600m = ygVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Integer num;
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List songInfoList = (java.util.List) obj2;
        java.util.LinkedList unComplianceList = (java.util.LinkedList) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoList, "songInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unComplianceList, "unComplianceList");
        sf2.x xVar = this.f488599i;
        if (intValue == 0) {
            gn2.a aVar = this.f488594d;
            int i17 = this.f488595e;
            aVar.n(i17);
            aVar.k(aVar.m());
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488596f, this.f488597g) && (num = this.f488598h) != null && i17 == num.intValue()) {
                xl2.d.a(xl2.d.f536648a, xVar.O6(), this.f488596f, 2, ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.c1) xVar.m56788xbba4bfc0(mm2.c1.class)).f410385o, null, 64, null);
            }
            if (!unComplianceList.isEmpty()) {
                mm2.m6 m6Var = (mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class);
                m6Var.getClass();
                java.util.LinkedList linkedList = m6Var.f410780o;
                linkedList.clear();
                linkedList.addAll(unComplianceList);
                db5.t7.g(xVar.O6(), xVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efh));
            }
            dk2.s sVar = ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410774f;
            sVar.getClass();
            dk2.yg item = this.f488600m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            java.util.ArrayList arrayList = sVar.f315586b;
            try {
                java.lang.Object obj4 = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                dk2.yg ygVar = (dk2.yg) obj4;
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item.f315926a, ygVar.f315926a);
                p012xc85e97e9.p093xedfae76a.j0 j0Var = sVar.f315585a;
                if (b17) {
                    java.lang.Integer num2 = (java.lang.Integer) j0Var.mo3195x754a37bb();
                    int i18 = -1;
                    if (num2 == null) {
                        num2 = -1;
                    }
                    int intValue2 = num2.intValue();
                    arrayList.remove(i17);
                    if (intValue2 > i17 && intValue2 != -1) {
                        i18 = intValue2 - 1;
                    } else if (intValue2 != i17) {
                        i18 = intValue2;
                    }
                    j0Var.mo7808x76db6cb1(java.lang.Integer.valueOf(i18));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "deletesongItem item:" + item + " songList size:" + arrayList.size() + ", locsongItem:" + ygVar + " , curPlayPos:" + j0Var);
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "FinderLiveAnchorMusicData deletesongItem");
            }
            mm2.m6 m6Var2 = (mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class);
            java.lang.String songName = item.f315926a;
            m6Var2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
            pm0.v.d0(m6Var2.f410780o, new mm2.l6(songName));
            java.util.ArrayList arrayList2 = ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410774f.f315586b;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                aVar.d(false);
            } else {
                gn2.a.q(aVar, false, 1, null);
            }
        } else {
            db5.t7.g(xVar.O6(), xVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573384ef4));
        }
        return jz5.f0.f384359a;
    }
}
