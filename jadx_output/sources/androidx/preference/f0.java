package androidx.preference;

/* loaded from: classes13.dex */
public class f0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f11812d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11813e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11814f;

    public f0(android.view.View view) {
        super(view);
        android.util.SparseArray sparseArray = new android.util.SparseArray(4);
        this.f11812d = sparseArray;
        sparseArray.put(android.R.id.title, view.findViewById(android.R.id.title));
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(com.tencent.mm.R.id.h6w, view.findViewById(com.tencent.mm.R.id.h6w));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
    }

    public android.view.View i(int i17) {
        android.util.SparseArray sparseArray = this.f11812d;
        android.view.View view = (android.view.View) sparseArray.get(i17);
        if (view != null) {
            return view;
        }
        android.view.View findViewById = this.itemView.findViewById(i17);
        if (findViewById != null) {
            sparseArray.put(i17, findViewById);
        }
        return findViewById;
    }
}
