package vd2;

/* loaded from: classes3.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f517496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f517498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f517499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f517501i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f517502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517503n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f517504o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f517505p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Context context, vd2.f1 f1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, android.content.Intent intent, r45.m84 m84Var, r45.wk0 wk0Var, android.content.Intent intent2, ss5.d0 d0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3) {
        super(0);
        this.f517496d = h0Var;
        this.f517497e = context;
        this.f517498f = f1Var;
        this.f517499g = h0Var2;
        this.f517500h = intent;
        this.f517501i = m84Var;
        this.f517502m = wk0Var;
        this.f517503n = intent2;
        this.f517504o = d0Var;
        this.f517505p = h0Var3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String str;
        r45.q82 q82Var;
        r45.ma4 ma4Var;
        java.lang.String m75945x2fec8307;
        r45.q82 q82Var2;
        java.lang.String m75945x2fec83072;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f517496d;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
        boolean z17 = charSequence == null || charSequence.length() == 0;
        vd2.f1 f1Var = this.f517498f;
        r45.wk0 wk0Var = this.f517502m;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f517499g;
        java.lang.String str2 = "";
        r45.m84 m84Var = this.f517501i;
        if (z17 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f391656d, xy2.c.e(this.f517497e))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveB visitor");
            android.content.Intent intent = this.f517503n;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5();
            q5Var.f206801a = java.lang.System.currentTimeMillis();
            q5Var.f206806f = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206869b = q5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1();
            p1Var.f206763a = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = p1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 1L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 1L;
            p1Var.f206764b = 0L;
            p1Var.f206765c = 0L;
            p1Var.f206766d = 0L;
            p1Var.f206767e = 0L;
            p1Var.f206768f = 0L;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(m84Var.m75942xfb822ef2(1));
            r45.nw1 nw1Var = (r45.nw1) h0Var2.f391656d;
            if (nw1Var != null && 1 == nw1Var.m75939xb282bd08(2)) {
                r45.nw1 nw1Var2 = (r45.nw1) h0Var2.f391656d;
                str = nw1Var2 != null ? nw1Var2.m75945x2fec8307(3) : null;
                if (str == null) {
                    str = "";
                }
                r45.nw1 nw1Var3 = (r45.nw1) h0Var2.f391656d;
                i17 = (nw1Var3 == null || (q82Var2 = (r45.q82) nw1Var3.m75936x14adae67(9)) == null) ? 1 : q82Var2.m75939xb282bd08(0);
                r45.nw1 nw1Var4 = (r45.nw1) h0Var2.f391656d;
                ma4Var = nw1Var4 != null ? (r45.ma4) nw1Var4.m75936x14adae67(23) : null;
                r45.nw1 nw1Var5 = (r45.nw1) h0Var2.f391656d;
                q82Var = nw1Var5 != null ? (r45.q82) nw1Var5.m75936x14adae67(9) : null;
            } else {
                i17 = 1;
                str = "";
                q82Var = null;
                ma4Var = null;
            }
            en0.g gVar = new en0.g();
            gVar.f336779a = 1;
            gVar.f336781c = m84Var.m75942xfb822ef2(1);
            gVar.f336795q = m84Var.m75945x2fec8307(2);
            gVar.f336787i = str;
            gVar.f336788j = i17;
            gVar.f336789k = m84Var.m75942xfb822ef2(0);
            gVar.f336784f = (java.lang.String) h0Var.f391656d;
            gVar.f336790l = m84Var.m75945x2fec8307(5);
            gVar.f336801w = m84Var.m75945x2fec8307(4);
            gVar.C = ma4Var != null ? ma4Var.mo14344x5f01b1f6() : null;
            gVar.f336791m = intent.getIntExtra("key_enter_live_param_bind_type", 0);
            java.lang.String stringExtra = intent.getStringExtra("key_enter_live_param_by_biz_username");
            if (stringExtra == null) {
                stringExtra = "";
            }
            gVar.f336792n = stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("key_enter_live_param_by_biz_nickname");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            gVar.f336793o = stringExtra2;
            java.lang.String stringExtra3 = intent.getStringExtra("key_enter_live_param_by_biz_headurl");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            gVar.f336794p = stringExtra3;
            gVar.D = q82Var != null ? q82Var.mo14344x5f01b1f6() : null;
            r45.y74 y74Var = (r45.y74) wk0Var.m75936x14adae67(6);
            if (y74Var != null && (m75945x2fec8307 = y74Var.m75945x2fec8307(8)) != null) {
                str2 = m75945x2fec8307;
            }
            gVar.f336802x = str2;
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a17 = gVar.a();
            r45.v74 v74Var = new r45.v74();
            v74Var.set(0, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) this.f517505p.f391656d);
            v74Var.set(1, (r45.nw1) h0Var2.f391656d);
            v74Var.set(2, (r45.u74) wk0Var.m75936x14adae67(8));
            a17.f150079p0 = v74Var;
            this.f517498f.Ui(0, kz5.b0.c(a17), this.f517502m, intent, null, this.f517504o, this.f517497e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveB anchor");
            r45.nw1 nw1Var6 = (r45.nw1) h0Var2.f391656d;
            if (nw1Var6 != null) {
                this.f517500h.putExtra("KEY_PARAMS_SOURCE_TYPE", nw1Var6.m75939xb282bd08(12));
            }
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Intent intent2 = this.f517500h;
            android.content.Context context = this.f517497e;
            long m75942xfb822ef2 = m84Var.m75942xfb822ef2(0);
            java.lang.Long valueOf = java.lang.Long.valueOf(m84Var.m75942xfb822ef2(1));
            java.lang.String m75945x2fec83073 = m84Var.m75945x2fec8307(2);
            java.lang.String str3 = m75945x2fec83073 == null ? "" : m75945x2fec83073;
            java.lang.String m75945x2fec83074 = m84Var.m75945x2fec8307(5);
            java.lang.String m75945x2fec83075 = wk0Var.m75945x2fec8307(0);
            java.lang.String str4 = m75945x2fec83075 == null ? "" : m75945x2fec83075;
            java.lang.String m75945x2fec83076 = m84Var.m75945x2fec8307(4);
            r45.y74 y74Var2 = (r45.y74) wk0Var.m75936x14adae67(6);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).oj(intent2, context, m75942xfb822ef2, valueOf, str3, m75945x2fec83074, str4, m75945x2fec83076, (y74Var2 == null || (m75945x2fec83072 = y74Var2.m75945x2fec8307(8)) == null) ? "" : m75945x2fec83072);
        }
        return jz5.f0.f384359a;
    }
}
