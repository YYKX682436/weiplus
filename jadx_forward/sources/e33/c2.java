package e33;

/* loaded from: classes10.dex */
public class c2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f328716d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f328718f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f328719g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f328720h = true;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f328717e = new java.util.LinkedList();

    public c2(android.content.Context context) {
        this.f328716d = context;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15636x5edd5fff c15636x5edd5fff, java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = this.f328717e;
        if (linkedList2 != null) {
            if (c15636x5edd5fff != null || linkedList2.size() > 0) {
                if (c15636x5edd5fff != null) {
                    int i17 = -1;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f328717e)) {
                        i17 = 0;
                        int i18 = -1;
                        while (true) {
                            if (i17 >= this.f328717e.size()) {
                                i17 = i18;
                                break;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) this.f328717e.get(i17);
                            if (c15630x7d8d0183.f219955n) {
                                break;
                            }
                            if (c15630x7d8d0183.f219954m) {
                                i18 = i17;
                            }
                            i17++;
                        }
                    }
                    int i19 = i17 + 1;
                    if (i19 < this.f328717e.size()) {
                        this.f328717e.add(i19, c15636x5edd5fff);
                    } else {
                        this.f328717e.add(c15636x5edd5fff);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryAdapter", "add favorite album item. insertFavIndex=%d, all album size=%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f328717e.size()));
                }
                if (linkedList.size() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryAdapter", "add other private album, size: [%s].", java.lang.Integer.valueOf(linkedList.size()));
                    this.f328717e.addAll(linkedList);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 getItem(int i17) {
        java.util.LinkedList linkedList = this.f328717e;
        if (linkedList == null || i17 >= linkedList.size()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) this.f328717e.get(i17);
    }

    public void d(java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryAdapter", "setAlbumFolder: old=%s new=%s", java.lang.Integer.valueOf(this.f328717e.size()), java.lang.Integer.valueOf(linkedList.size()));
        this.f328717e = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f328717e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.c2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
