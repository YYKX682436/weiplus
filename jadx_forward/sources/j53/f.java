package j53;

/* loaded from: classes10.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8 f379343d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8 activityC15916xd0c73bc8) {
        this.f379343d = activityC15916xd0c73bc8;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8 activityC15916xd0c73bc8 = this.f379343d;
        if (!((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) activityC15916xd0c73bc8.f221635e).mo69311xc00617a4()) {
            return true;
        }
        int mo69307x9746038c = ((int) (activityC15916xd0c73bc8.f221635e.mo69307x9746038c() - activityC15916xd0c73bc8.f221642o)) / 1000;
        android.widget.TextView textView = activityC15916xd0c73bc8.f221638h;
        if (textView == null || (i17 = activityC15916xd0c73bc8.f221645r) <= 0) {
            return true;
        }
        int i18 = i17 - mo69307x9746038c;
        if (i18 < 0) {
            i18 = 0;
        }
        textView.setText(i18 + "\"");
        return true;
    }
}
