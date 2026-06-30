package i12;

/* loaded from: classes15.dex */
public class c0 extends db5.z8 implements android.view.View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f368728e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f368729f;

    /* renamed from: g, reason: collision with root package name */
    public int f368730g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f368731h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f368732i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final i12.a0 f368733m;

    public c0(android.content.Context context, java.util.LinkedList linkedList) {
        i12.a0 a0Var = new i12.a0(null);
        this.f368733m = a0Var;
        if (linkedList == null) {
            throw new java.lang.IllegalAccessError("must has emoji banner list");
        }
        this.f368729f = context;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f368728e = linkedList2;
        linkedList2.addAll(linkedList);
        a0Var.f368698a = this;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        java.util.LinkedList linkedList = this.f368728e;
        if (linkedList == null) {
            return 0;
        }
        if (linkedList.size() == 1) {
            return 1;
        }
        return linkedList.size() * 60;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        int i17 = this.f368730g;
        if (i17 <= 0) {
            return super.mo8339xb2fa47d2(obj);
        }
        this.f368730g = i17 - 1;
        return -2;
    }

    @Override // db5.z8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        if (this.f368731h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "has destroy need to notify");
        } else {
            this.f368730g = mo8338x7444f759();
            super.mo8343xced61ae5();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreVpHeaderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b) this.f368728e.get(((java.lang.Integer) view.getTag(com.p314xaae8f345.mm.R.id.dbf)).intValue());
        if (bVar != null) {
            if (bVar.f179072c) {
                y12.m.a(this.f368729f, bVar.f179070a, true);
            } else {
                r45.zj0 zj0Var = bVar.f179071b.f457743d;
                if (zj0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11929, 0);
                    y12.m.e(this.f368729f, zj0Var, false, 15, -1, -1, "", 8, true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreVpHeaderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
