package zy4;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 f559210d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824) {
        this.f559210d = activityC19511xc9358824;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = view.getTag().toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrl", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824 = this.f559210d;
        intent.putExtra("urlList", (java.lang.String[]) ((zy4.f) activityC19511xc9358824.f269622n.mo7946xf939df19()).f559211d.toArray(new java.lang.String[0]));
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(intent.getExtras());
        if (intent.getFlags() != 0) {
            intent2.addFlags(intent.getFlags());
        }
        j45.l.j(activityC19511xc9358824, "subapp", ".ui.gallery.GestureGalleryUI", intent2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
