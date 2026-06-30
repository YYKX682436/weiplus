package m52;

/* loaded from: classes15.dex */
public final class b implements m52.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f405070a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Field f405071b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f405072c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f405073d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f405074e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Field f405075f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Field f405076g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Field f405077h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Field f405078i;

    public b() {
        try {
            this.f405070a = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder.class;
            java.lang.reflect.Field declaredField = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder.class.getDeclaredField("timeLineObject");
            this.f405071b = declaredField;
            declaredField.setAccessible(true);
            java.lang.reflect.Field declaredField2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder.class.getDeclaredField("isAd");
            this.f405073d = declaredField2;
            declaredField2.setAccessible(true);
            int i17 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.f273718d;
            java.lang.reflect.Field declaredField3 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.class.getDeclaredField("Id");
            this.f405072c = declaredField3;
            declaredField3.setAccessible(true);
            java.lang.reflect.Field declaredField4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder.class.getDeclaredField("snsobj");
            this.f405074e = declaredField4;
            declaredField4.setAccessible(true);
            int i18 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7.f273717d;
            java.lang.reflect.Field declaredField5 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7.class.getDeclaredField("CommentUserList");
            this.f405076g = declaredField5;
            declaredField5.setAccessible(true);
            java.lang.reflect.Field declaredField6 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7.class.getDeclaredField("LikeCount");
            this.f405075f = declaredField6;
            declaredField6.setAccessible(true);
            java.lang.reflect.Field declaredField7 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7.class.getDeclaredField("Username");
            this.f405077h = declaredField7;
            declaredField7.setAccessible(true);
            java.lang.reflect.Field declaredField8 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7.class.getDeclaredField("Nickname");
            this.f405078i = declaredField8;
            declaredField8.setAccessible(true);
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String a(android.view.View view, int i17) {
        java.lang.Object tag = view.getTag();
        if (tag == null) {
            return null;
        }
        try {
            if (!this.f405070a.isInstance(tag)) {
                return null;
            }
            java.lang.Object obj = this.f405071b.get(tag);
            if (obj == null) {
                return null;
            }
            try {
                return (java.lang.String) this.f405072c.get(obj);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.SnsFeedParamCatcher", e17, "getFeedParams.feedId: ", new java.lang.Object[0]);
                return null;
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
