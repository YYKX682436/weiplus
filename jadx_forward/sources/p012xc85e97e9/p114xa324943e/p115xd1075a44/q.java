package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* loaded from: classes15.dex */
public class q implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams layoutParams = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) ((android.view.View) obj).getLayoutParams();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams layoutParams2 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) ((android.view.View) obj2).getLayoutParams();
        boolean z17 = layoutParams.f93956a;
        return z17 != layoutParams2.f93956a ? z17 ? 1 : -1 : layoutParams.f93960e - layoutParams2.f93960e;
    }
}
