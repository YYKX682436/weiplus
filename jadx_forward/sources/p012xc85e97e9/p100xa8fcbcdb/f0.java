package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class f0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f93345d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93347f;

    public f0(android.view.View view) {
        super(view);
        android.util.SparseArray sparseArray = new android.util.SparseArray(4);
        this.f93345d = sparseArray;
        sparseArray.put(android.R.id.title, view.findViewById(android.R.id.title));
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(com.p314xaae8f345.mm.R.id.h6w, view.findViewById(com.p314xaae8f345.mm.R.id.h6w));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
    }

    public android.view.View i(int i17) {
        android.util.SparseArray sparseArray = this.f93345d;
        android.view.View view = (android.view.View) sparseArray.get(i17);
        if (view != null) {
            return view;
        }
        android.view.View findViewById = this.f3639x46306858.findViewById(i17);
        if (findViewById != null) {
            sparseArray.put(i17, findViewById);
        }
        return findViewById;
    }
}
