package va2;

/* loaded from: classes2.dex */
public final class h extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public final long f515775g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f515776h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f515777i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f515775g = m158359x1e885992().getLongExtra("key_ref_object_id", 0L);
        this.f515776h = m158359x1e885992().getStringExtra("key_ref_object_dup_flag");
        this.f515777i = m158359x1e885992().getBooleanExtra("KEY_IS_HIGH_LIGHT_TOPIC", false);
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        android.widget.FrameLayout frameLayout = this.f534253e;
        android.view.View findViewById = frameLayout != null ? frameLayout.findViewById(com.p314xaae8f345.mm.R.id.qdr) : null;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() == 0) {
            r45.r03 r03Var = (r45.r03) this.f534252d;
            java.lang.String m75945x2fec8307 = r03Var != null ? r03Var.m75945x2fec8307(0) : null;
            stringExtra = m75945x2fec8307 != null ? m75945x2fec8307 : "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.O(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, findViewById, "topic_post_feed", 0, kz5.b1.e(new jz5.l("topic_name", stringExtra)), null, 20, null);
        if (findViewById != null) {
            findViewById.setOnClickListener(new va2.g(this));
        }
        if (!this.f515777i || findViewById == null) {
            return;
        }
        findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563090wj);
        int color = m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.qds);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(color);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.qdt);
        if (textView != null) {
            textView.setText(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m19));
            textView.setTextColor(color);
        }
    }

    @Override // x92.r
    public void S6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.r03 r03Var = (r45.r03) fVar;
        super.S6(r03Var);
        java.lang.String u17 = pm0.v.u(r03Var != null ? r03Var.m75942xfb822ef2(1) : 0L);
        android.widget.FrameLayout frameLayout = this.f534253e;
        if (frameLayout != null && frameLayout.findViewById(com.p314xaae8f345.mm.R.id.qdu) != null) {
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            xy2.c.e(m158354x19263085());
            if (r03Var != null) {
                r03Var.m75945x2fec8307(0);
            }
            xVar.getClass();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(m158354x19263085(), "page_topicid", u17);
    }
}
