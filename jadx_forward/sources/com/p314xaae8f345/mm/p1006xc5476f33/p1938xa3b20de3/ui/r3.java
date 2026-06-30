package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class r3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        super(activityC16764xd1ab6b38);
        this.f234234g = activityC16764xd1ab6b38;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h3
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234234g;
        activityC16764xd1ab6b38.U = (android.widget.LinearLayout) activityC16764xd1ab6b38.findViewById(com.p314xaae8f345.mm.R.id.pcw);
        this.f234168d = (android.widget.TextView) activityC16764xd1ab6b38.U.findViewById(com.p314xaae8f345.mm.R.id.dm6);
        this.f234169e = (android.widget.TextView) activityC16764xd1ab6b38.U.findViewById(com.p314xaae8f345.mm.R.id.dm8);
        this.f234170f = (android.widget.ImageView) activityC16764xd1ab6b38.U.findViewById(com.p314xaae8f345.mm.R.id.dm7);
        activityC16764xd1ab6b38.U.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q3(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return "facingreceivereddot";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f234234g.U;
    }
}
