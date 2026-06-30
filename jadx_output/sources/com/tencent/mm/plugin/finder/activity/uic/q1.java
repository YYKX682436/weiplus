package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public class q1 extends x92.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.o, x92.r
    public void O6(int i17, java.lang.String str) {
        super.O6(i17, str);
        aa2.b bVar = new aa2.b(getActivity());
        bVar.b();
        bVar.a(i17, str);
        if (i17 == -4058) {
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            long longExtra = bVar.f2491a.getIntent().getLongExtra("key_feed_ref_id", 0L);
            am.ia iaVar = feedUpdateEvent.f54252g;
            iaVar.f6918a = longExtra;
            iaVar.f6919b = 13;
            feedUpdateEvent.e();
        }
    }

    @Override // x92.o, x92.r
    public void P6(int i17, java.lang.String str) {
        super.P6(i17, str);
        com.tencent.mars.xlog.Log.i("FinderActivityTipsUIC", "responseCode:" + i17 + ", errMsg:" + str);
        if (getActivity().isFinishing()) {
            return;
        }
        getActivity().finish();
    }

    @Override // x92.o
    public void W6() {
        android.widget.FrameLayout V6;
        super.W6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("key_cover_url")) || (V6 = V6()) == null) {
            return;
        }
        V6.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.awq));
    }
}
