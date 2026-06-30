package in2;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f374372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(in2.s sVar, in2.a1 a1Var) {
        super(2);
        this.f374371d = sVar;
        this.f374372e = a1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        te2.j0 j0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        dk2.yg musicItem = (dk2.yg) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f409903p1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "7");
        jSONObject.put("music_name", musicItem.f315926a);
        jSONObject.put("clear_hot_value", musicItem.f315927b);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        in2.s sVar = this.f374371d;
        java.lang.Integer num = (java.lang.Integer) ((mm2.m6) sVar.H.a(mm2.m6.class)).f410774f.f315585a.mo3195x754a37bb();
        if (num == null) {
            num = -1;
        }
        int intValue2 = num.intValue();
        in2.a1 a1Var = this.f374372e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f374329f, "itemClickListener curPlayPos:" + intValue2 + " newPos:" + intValue + " singSongName:" + musicItem.f315926a);
        sf2.x xVar = sVar.I;
        xVar.getClass();
        dk2.s sVar2 = ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410774f;
        sVar2.getClass();
        try {
            dk2.yg c18 = sVar2.c();
            java.util.ArrayList arrayList = sVar2.f315586b;
            java.lang.Object obj3 = arrayList.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            dk2.yg ygVar = (dk2.yg) obj3;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ygVar.f315926a, musicItem.f315926a);
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = sVar2.f315585a;
            if (b17) {
                ygVar.f315928c = 4;
                ygVar.f315927b = 0L;
                if (c18 != null) {
                    c18.f315928c = 3;
                }
                if (c18 != null) {
                    c18.f315931f = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", ygVar.f315926a + ", MUSIC_PLAY}");
                j0Var2.mo7808x76db6cb1(java.lang.Integer.valueOf(intValue));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "playsongItem item:" + musicItem + " songList size:" + arrayList.size() + ", pos:" + intValue + ", newsongItem:" + ygVar + ", curPlayPos:" + j0Var2);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicData playsongItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) xVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class);
        if (h8Var != null && (j0Var = h8Var.f194318q) != null) {
            ((te2.p1) j0Var).y();
        }
        xl2.d.a(xl2.d.f536648a, xVar.O6(), musicItem.f315926a, 1, ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.c1) xVar.m56788xbba4bfc0(mm2.c1.class)).f410385o, null, 64, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "playMusic " + musicItem + ", forcePlay:true, stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        a1Var.m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
