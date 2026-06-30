package gx0;

/* loaded from: classes5.dex */
public final class h9 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f358037d;

    public h9(gx0.p9 p9Var) {
        this.f358037d = p9Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17;
        cx0.c cVar = (cx0.c) obj;
        java.util.List list = cVar.f306033a;
        boolean z18 = list instanceof java.util.Collection;
        boolean z19 = true;
        gx0.p9 p9Var = this.f358037d;
        if (!z18 || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (p9Var.f358366u.contains(((cx0.b) it.next()).f306030b)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        java.util.List list2 = cVar.f306034b;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                if (p9Var.f358366u.contains(((cx0.b) it6.next()).f306030b)) {
                    break;
                }
            }
        }
        z19 = false;
        if (z17 || z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "observeTimelineMutation: inserts=" + cVar.f306033a.size() + ", deletes=" + list2.size() + ", updates=" + cVar.f306035c.size());
            p9Var.o7();
        }
    }
}
