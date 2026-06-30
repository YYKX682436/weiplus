package py0;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f440511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440509e = str;
        this.f440510f = str2;
        this.f440511g = intent;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new py0.d(this.f440509e, this.f440510f, this.f440511g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((py0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.e21 e21Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440508d;
        jz5.f0 f0Var = null;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String finderNickName = this.f440509e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderNickName, "finderNickName");
            java.lang.String eventName = this.f440510f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
            bq.p1 p1Var = new bq.p1(null, finderNickName, eventName);
            this.f440508d = 1;
            obj = rm0.h.a(p1Var, 0L, null, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.LinkedList m75941xfb821914 = ((r45.du2) obj).m75941xfb821914(2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (m75941xfb821914 != null && (e21Var = (r45.e21) kz5.n0.Z(m75941xfb821914)) != null) {
            if (!(e21Var.m75939xb282bd08(12) != 1)) {
                e21Var = null;
            }
            if (e21Var != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
                long m75942xfb822ef2 = e21Var.m75942xfb822ef2(0);
                android.content.Intent intent = this.f440511g;
                intent.putExtra("key_topic_id", m75942xfb822ef2);
                intent.putExtra("key_activity_type", 102);
                if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                    str = "";
                }
                intent.putExtra("key_user_name", str);
                if (c19782x23db1cfa == null || (str2 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                    str2 = "";
                }
                intent.putExtra("key_nick_name", str2);
                if (c19782x23db1cfa == null || (str3 = c19782x23db1cfa.m76175x6d346f39()) == null) {
                    str3 = "";
                }
                intent.putExtra("key_avatar_url", str3);
                java.lang.String m75945x2fec8307 = e21Var.m75945x2fec8307(5);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                intent.putExtra("key_cover_url", m75945x2fec8307);
                intent.putExtra("key_activity_display_mask", e21Var.m75942xfb822ef2(17));
                java.lang.String m75945x2fec83072 = e21Var.m75945x2fec8307(2);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                intent.putExtra("key_activity_name", m75945x2fec83072);
                java.lang.String m75945x2fec83073 = e21Var.m75945x2fec8307(3);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                intent.putExtra("key_activity_desc", m75945x2fec83073);
                intent.putExtra("key_activity_end_time", e21Var.m75942xfb822ef2(13));
                intent.putExtra("saveActivity", true);
                if (c19782x23db1cfa == null || (str4 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                    str4 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "eventInfo nickname = ".concat(str4));
                java.lang.String m75945x2fec83074 = e21Var.m75945x2fec8307(2);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "eventInfo eventname = ".concat(m75945x2fec83074));
                java.lang.String m75945x2fec83075 = e21Var.m75945x2fec8307(3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "eventInfo description = ".concat(m75945x2fec83075 != null ? m75945x2fec83075 : ""));
                f0Var = f0Var2;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MaasBaseUILogicUIC", "activity closed or get error");
        }
        return f0Var2;
    }
}
