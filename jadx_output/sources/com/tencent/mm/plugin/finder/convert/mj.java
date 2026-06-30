package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class mj implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104006d;

    public mj(com.tencent.mm.plugin.finder.convert.oj ojVar) {
        this.f104006d = ojVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f104006d;
        int i17 = ojVar.f104190o;
        if (i17 <= 0) {
            return false;
        }
        int i18 = i17 - 1;
        ojVar.f104190o = i18;
        android.widget.TextView textView = ojVar.f104191p;
        if (textView != null) {
            textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491283cm1, java.lang.Integer.valueOf(i18)));
        }
        if (ojVar.f104190o == 0) {
            yz5.l lVar = ojVar.f104183e;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf(ojVar.f104196u));
            }
            ojVar.C();
        }
        return true;
    }
}
