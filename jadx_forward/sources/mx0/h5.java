package mx0;

/* loaded from: classes.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ol0 f413559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(r45.ol0 ol0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413559e = ol0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.h5(this.f413559e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.h5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413558d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.ol0 ol0Var = this.f413559e;
            java.lang.String event_name = ol0Var.f463872e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(event_name, "event_name");
            java.lang.String creator_nickname = ol0Var.f463871d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(creator_nickname, "creator_nickname");
            this.f413558d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new us2.v(creator_nickname, event_name, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.e21 e21Var = (r45.e21) obj;
        if (e21Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            android.os.Bundle bundle = ut3.f.f512709c.f512711b;
            bundle.putLong("key_topic_id", e21Var.m75942xfb822ef2(0));
            bundle.putInt("key_activity_type", 102);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            bundle.putString("key_user_name", str);
            if (c19782x23db1cfa == null || (str2 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str2 = "";
            }
            bundle.putString("key_nick_name", str2);
            if (c19782x23db1cfa == null || (str3 = c19782x23db1cfa.m76175x6d346f39()) == null) {
                str3 = "";
            }
            bundle.putString("key_avatar_url", str3);
            java.lang.String m75945x2fec8307 = e21Var.m75945x2fec8307(5);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            bundle.putString("key_cover_url", m75945x2fec8307);
            bundle.putLong("key_activity_display_mask", e21Var.m75942xfb822ef2(17));
            java.lang.String m75945x2fec83072 = e21Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            bundle.putString("key_activity_name", m75945x2fec83072);
            java.lang.String m75945x2fec83073 = e21Var.m75945x2fec8307(3);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            bundle.putString("key_activity_desc", m75945x2fec83073);
            bundle.putLong("key_activity_end_time", e21Var.m75942xfb822ef2(13));
            bundle.putBoolean("saveActivity", true);
            if (c19782x23db1cfa == null || (str4 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str4 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "eventInfo nickname = ".concat(str4));
            java.lang.String m75945x2fec83074 = e21Var.m75945x2fec8307(2);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "eventInfo eventname = ".concat(m75945x2fec83074));
            java.lang.String m75945x2fec83075 = e21Var.m75945x2fec8307(3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "eventInfo description = ".concat(m75945x2fec83075 != null ? m75945x2fec83075 : ""));
        }
        return jz5.f0.f384359a;
    }
}
