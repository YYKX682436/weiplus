package lo2;

/* loaded from: classes8.dex */
public final class f0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc f401654d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc) {
        this.f401654d = activityC14486x9c4a98dc;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc = this.f401654d;
        activityC14486x9c4a98dc.mo48674x36654fab();
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberSearchUI", "onItemClick position:" + i17);
        } else {
            java.lang.Object obj = activityC14486x9c4a98dc.A.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_member_saerch_feed_id", ((jo2.e) obj).f382417d.f460209i);
            activityC14486x9c4a98dc.setResult(-1, intent);
            activityC14486x9c4a98dc.finish();
        }
    }
}
