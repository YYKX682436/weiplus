package z83;

/* loaded from: classes14.dex */
public final class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 f552271a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6) {
        this.f552271a = activityC16160x425523e6;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6 = this.f552271a;
        if (!K0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.f224672t;
            sb6.append((java.lang.Object) activityC16160x425523e6.T6().f525535n.getText());
            java.lang.String sb7 = sb6.toString();
            int length = sb7.length() - 1;
            int i18 = 0;
            boolean z17 = false;
            while (i18 <= length) {
                boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(sb7.charAt(!z17 ? i18 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    }
                    length--;
                } else if (z18) {
                    i18++;
                } else {
                    z17 = true;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7.subSequence(i18, length + 1).toString())) {
                activityC16160x425523e6.T6().f525535n.setText((java.lang.CharSequence) null);
            }
        }
        if (!fp.i.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KidsWatchRegGetInfoUI", "SDcard is not available");
            return false;
        }
        android.graphics.Bitmap bitmap = activityC16160x425523e6.f224681o;
        if (bitmap != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            if (!bitmap.isRecycled() && !activityC16160x425523e6.f224680n) {
                activityC16160x425523e6.T6().f525524c.setImageBitmap(activityC16160x425523e6.f224681o);
                activityC16160x425523e6.T6().f525524c.setVisibility(0);
                activityC16160x425523e6.T6().f525523b.setVisibility(8);
                activityC16160x425523e6.f224680n = true;
            }
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m178563x9616526c() {
        return super.toString() + "|initView2";
    }
}
