package y73;

/* loaded from: classes11.dex */
public abstract class u0 {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "msg is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "try to show dialog");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new y73.t0(str, str2, str3, str4, onClickListener, onClickListener2));
        }
    }
}
