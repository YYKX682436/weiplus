package ba;

/* loaded from: classes14.dex */
public class c extends androidx.customview.widget.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.Chip f18639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.google.android.material.chip.Chip chip, com.google.android.material.chip.Chip chip2) {
        super(chip2);
        this.f18639e = chip;
    }

    @Override // androidx.customview.widget.d
    public int getVirtualViewAt(float f17, float f18) {
        android.graphics.RectF closeIconTouchBounds;
        android.graphics.Rect rect = com.google.android.material.chip.Chip.f44464u;
        com.google.android.material.chip.Chip chip = this.f18639e;
        if (chip.c()) {
            closeIconTouchBounds = chip.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(f17, f18)) {
                return 0;
            }
        }
        return -1;
    }

    @Override // androidx.customview.widget.d
    public void getVisibleVirtualViews(java.util.List list) {
        android.graphics.Rect rect = com.google.android.material.chip.Chip.f44464u;
        if (this.f18639e.c()) {
            list.add(0);
        }
    }

    @Override // androidx.customview.widget.d
    public boolean onPerformActionForVirtualView(int i17, int i18, android.os.Bundle bundle) {
        if (i18 == 16 && i17 == 0) {
            return this.f18639e.e();
        }
        return false;
    }

    @Override // androidx.customview.widget.d
    public void onPopulateNodeForHost(o3.l lVar) {
        com.google.android.material.chip.Chip chip = this.f18639e;
        ba.f fVar = chip.f44466e;
        lVar.m(fVar != null && fVar.f18668z);
        lVar.n(com.google.android.material.chip.Chip.class.getName());
        lVar.v(chip.getText());
    }

    @Override // androidx.customview.widget.d
    public void onPopulateNodeForVirtualView(int i17, o3.l lVar) {
        android.graphics.Rect closeIconTouchBoundsInt;
        android.graphics.Rect rect = com.google.android.material.chip.Chip.f44464u;
        com.google.android.material.chip.Chip chip = this.f18639e;
        if (!chip.c()) {
            lVar.p("");
            lVar.k(com.google.android.material.chip.Chip.f44464u);
            return;
        }
        java.lang.CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            lVar.p(closeIconContentDescription);
        } else {
            java.lang.CharSequence text = chip.getText();
            android.content.Context context = chip.getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = android.text.TextUtils.isEmpty(text) ? "" : text;
            lVar.p(context.getString(com.tencent.mm.R.string.h0d, objArr).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        lVar.k(closeIconTouchBoundsInt);
        lVar.b(o3.f.f342625g);
        lVar.q(chip.isEnabled());
    }
}
