package l02;

/* loaded from: classes3.dex */
public abstract class n {
    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            str = str + "_dark";
        }
        imageView.setImageResource(imageView.getResources().getIdentifier(str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, imageView.getContext().getPackageName()));
    }
}
