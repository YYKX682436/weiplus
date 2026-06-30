package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class a0 implements android.os.Parcelable.Creator {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745 a(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 k9Var) {
        r45.o54 o54Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745 abstractC12323x626e3745 = null;
        if (k9Var != null && (o54Var = k9Var.f67125x2eee6aee) != null) {
            int i18 = o54Var.f463475d;
            if (i18 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", k9Var.f67125x2eee6aee.f463476e);
                intent.putExtra("forceHideShare", true);
                abstractC12323x626e3745 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12327xdbe94a4c(str, i17, "webview", ".ui.tools.WebViewUI", intent);
            } else if (i18 == 3) {
                abstractC12323x626e3745 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12324x46612517(str, i17, o54Var.f463479h, o54Var.f463478g);
            } else if (i18 == 5) {
                abstractC12323x626e3745 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12325x121b5ee9(str, i17);
            } else if (i18 == 7) {
                abstractC12323x626e3745 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12326xf8431591(str, i17, u46.l.u(o54Var.f463481m));
            }
            if (abstractC12323x626e3745 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLaunchErrorAction", "createFromLaunchInfo hit error, appId:%s, versionType:%d, ActionCode:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k9Var.f67125x2eee6aee.f463475d));
            }
        }
        return abstractC12323x626e3745;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745) java.lang.Class.forName(readString).getDeclaredConstructor(android.os.Parcel.class).newInstance(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745[i17];
    }
}
