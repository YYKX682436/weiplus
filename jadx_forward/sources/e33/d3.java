package e33;

/* loaded from: classes10.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f328730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 f328731e;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14, java.util.LinkedList linkedList) {
        this.f328731e = c15655x4db85b14;
        this.f328730d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = this.f328731e;
        c15655x4db85b14.f220097i.d(this.f328730d);
        c15655x4db85b14.f220097i.notifyDataSetChanged();
    }

    /* renamed from: toString */
    public java.lang.String m126854x9616526c() {
        return super.toString() + "|onQueryAlbumFinished";
    }
}
