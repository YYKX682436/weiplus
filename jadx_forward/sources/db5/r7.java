package db5;

/* loaded from: classes.dex */
public abstract class r7 {

    /* renamed from: a, reason: collision with root package name */
    public static android.widget.Toast f310028a;

    /* renamed from: b, reason: collision with root package name */
    public static int f310029b;

    public static void a(android.content.Context context, int i17) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (f310029b != i17) {
            f310028a = null;
            f310029b = i17;
        }
        if (f310028a == null) {
            f310028a = android.widget.Toast.makeText(applicationContext, "", 1);
        }
        android.view.View inflate = android.view.View.inflate(applicationContext, com.p314xaae8f345.mm.R.C30864xbddafb2a.cig, null);
        if (i17 == 1) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mcu)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gtl);
        } else if (i17 == 3) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mcu)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gtm);
        } else {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mcu)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gtn);
        }
        f310028a.setView(inflate);
        f310028a.show();
    }
}
