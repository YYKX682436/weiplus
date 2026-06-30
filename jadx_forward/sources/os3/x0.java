package os3;

/* loaded from: classes8.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa f429779d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa) {
        this.f429779d = activityC16932x23233efa;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa = this.f429779d;
        android.content.Intent intent = new android.content.Intent(activityC16932x23233efa, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c.class);
        intent.putExtra("attach_name", activityC16932x23233efa.f236393g);
        intent.putExtra("mail_id", activityC16932x23233efa.f236390d);
        intent.putExtra("attach_id", activityC16932x23233efa.f236391e);
        intent.putExtra("total_size", activityC16932x23233efa.f236392f);
        intent.putExtra("is_preview", 0);
        intent.putExtra("is_compress", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa2 = this.f429779d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16932x23233efa2, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$4", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16932x23233efa2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16932x23233efa2, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$4", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
