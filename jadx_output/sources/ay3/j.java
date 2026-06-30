package ay3;

/* loaded from: classes3.dex */
public final class j implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI f15290d;

    public j(com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI ringtoneSearchUI) {
        this.f15290d = ringtoneSearchUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        this.f15290d.hideVKB();
    }
}
