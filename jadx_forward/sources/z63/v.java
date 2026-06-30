package z63;

/* loaded from: classes5.dex */
public class v implements java.util.Comparator {
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.Integer num2 = (java.lang.Integer) obj2;
        if (num.intValue() < num2.intValue()) {
            return 1;
        }
        return num == num2 ? 0 : -1;
    }
}
