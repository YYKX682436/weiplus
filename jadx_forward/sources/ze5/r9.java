package ze5;

/* loaded from: classes5.dex */
public final class r9 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public static final ze5.r9 f553717a = new ze5.r9();

    @Override // j45.g
    /* renamed from: onActivityResult */
    public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (i17 == 2000 && i18 == -1 && (stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames")) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, ";");
        }
    }
}
