package y22;

/* loaded from: classes10.dex */
public final class w implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13391xbe5a8bbf f540650a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13391xbe5a8bbf activityC13391xbe5a8bbf) {
        this.f540650a = activityC13391xbe5a8bbf;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        int length = iArr.length;
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            if (iArr[i18] != 0) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13391xbe5a8bbf activityC13391xbe5a8bbf = this.f540650a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC13391xbe5a8bbf.f180171d, "request permission: not granted");
            activityC13391xbe5a8bbf.finish();
        }
    }
}
