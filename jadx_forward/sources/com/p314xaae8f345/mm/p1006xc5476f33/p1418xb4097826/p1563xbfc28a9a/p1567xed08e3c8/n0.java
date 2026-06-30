package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f202791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f202792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f202793c;

    /* renamed from: d, reason: collision with root package name */
    public gx2.q f202794d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14468x579dd28e f202795e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f202796f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f202797g;

    public n0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f202791a = context;
        this.f202792b = i17;
        this.f202793c = i18;
        if (this.f202794d == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(i17);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            this.f202796f = frameLayout;
            float k17 = (i65.a.k(context) + com.p314xaae8f345.mm.ui.bk.p(context)) * kx2.a.f394811a.a(context);
            gx2.a aVar = new gx2.a();
            aVar.f358870c = k17;
            aVar.f358871d = new hx2.g(context, 0, 0, 0, false, false, 62, null);
            android.widget.FrameLayout frameLayout2 = this.f202796f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
            aVar.f358872e = new hx2.c(frameLayout2);
            aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k0(this));
            ((java.util.ArrayList) aVar.f358876i).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.l0(this));
            aVar.f358873f = new hx2.b(context, true);
            android.view.View findViewById = context.findViewById(android.R.id.content);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            gx2.q b17 = aVar.b((android.view.ViewGroup) findViewById);
            this.f202794d = b17;
            b17.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.m0(this));
        }
        this.f202797g = "";
    }

    public final void a() {
        gx2.q qVar = this.f202794d;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
        }
    }

    public final void b(int i17, java.lang.String authorFinderUsername, java.lang.String memberTicket, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, java.lang.String collectionName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberTicket, "memberTicket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectionName, "collectionName");
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = this.f202791a.mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        if (this.f202795e == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f202797g, authorFinderUsername) || 0 != j17) {
            android.widget.FrameLayout frameLayout = this.f202796f;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.f202795e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14468x579dd28e();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_author_finder_name", authorFinderUsername);
            bundle.putString("key_finder_member_ticket", memberTicket);
            bundle.putInt("key_finder_feed_count", i17);
            bundle.putInt("key_finder_member_feed_type", this.f202793c);
            bundle.putLong("key_member_topic_id", j17);
            bundle.putString("key_member_collection_name", collectionName);
            bundle.putByteArray("key_member_last_buffer", gVar != null ? gVar.g() : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14468x579dd28e c14468x579dd28e = this.f202795e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14468x579dd28e);
            c14468x579dd28e.mo7562xe26dab14(bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14468x579dd28e c14468x579dd28e2 = this.f202795e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14468x579dd28e2);
            m7630xb2c12e75.k(this.f202792b, c14468x579dd28e2, null);
            m7630xb2c12e75.f();
        }
        gx2.q qVar = this.f202794d;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(qVar, false, 1, null);
        }
    }
}
