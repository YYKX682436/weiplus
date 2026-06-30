package fp;

/* loaded from: classes4.dex */
public abstract class j0 {
    public static int a(android.content.Context context, int i17) {
        try {
            android.content.res.Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            return identifier != 0 ? resources.getDimensionPixelSize(identifier) : i17;
        } catch (android.content.res.Resources.NotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResourceCompat", e17, "get res of status_bar_height fail", new java.lang.Object[0]);
            return i17;
        }
    }
}
