package k93;

/* loaded from: classes8.dex */
public class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 f387419d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58) {
        this.f387419d = c16179x5fcf4d58;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58 = this.f387419d;
        if (editable == null) {
            android.widget.ImageView imageView = c16179x5fcf4d58.T;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        java.lang.String obj = editable.toString();
        c16179x5fcf4d58.M(obj);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj);
        android.widget.ImageView imageView2 = c16179x5fcf4d58.T;
        if (imageView2 != null) {
            if (z17) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        c16179x5fcf4d58.L = obj;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (charSequence != null) {
            charSequence.toString();
            k93.h hVar = this.f387419d.W;
            if (hVar != null) {
                java.lang.String charSequence2 = charSequence.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = ((f93.l1) hVar).f341912a;
                activityC16168xac76ee12.f224754e = charSequence2;
                activityC16168xac76ee12.m78501x43e00957(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence2));
                android.widget.TextView textView = activityC16168xac76ee12.f224765s.U;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
        }
    }
}
