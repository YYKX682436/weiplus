package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class RoomButtonPreference extends com.tencent.mm.ui.base.preference.ButtonPreference {
    public boolean W;
    public java.lang.String X;
    public android.view.View Y;

    public RoomButtonPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.ui.base.preference.ButtonPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(view);
        aVar.pk(view, this.X);
        aVar.Ai(view, new com.tencent.mm.chatroom.ui.o8(this));
        aVar.ik(view, 8, 26501);
    }

    @Override // com.tencent.mm.ui.base.preference.ButtonPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        this.Y = u17;
        return u17;
    }

    public RoomButtonPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
