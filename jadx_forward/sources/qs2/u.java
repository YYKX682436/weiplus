package qs2;

/* loaded from: classes8.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f447857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f447859f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Intent intent, android.content.Context context, int i17) {
        super(1);
        this.f447857d = intent;
        this.f447858e = context;
        this.f447859f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.e21 e21Var = (r45.e21) obj;
        qs2.v vVar = qs2.v.f447860a;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        int i17 = this.f447859f;
        android.content.Context context = this.f447858e;
        android.content.Intent intent = this.f447857d;
        if (e21Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            intent.putExtra("key_topic_id", e21Var.m75942xfb822ef2(0));
            intent.putExtra("key_activity_type", 101);
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
            intent.putExtra("key_activity_desc", m75945x2fec83073 != null ? m75945x2fec83073 : "");
            intent.putExtra("key_activity_end_time", e21Var.m75942xfb822ef2(13));
            intent.putExtra("saveActivity", true);
            vVar.f(intent, context, i17);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            vVar.f(intent, context, i17);
        }
        return f0Var2;
    }
}
