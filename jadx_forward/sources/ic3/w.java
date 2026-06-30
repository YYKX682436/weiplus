package ic3;

/* loaded from: classes12.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371956d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371956d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.f229382o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371956d;
        activityC16419x510d00b7.getClass();
        android.widget.EditText editText = new android.widget.EditText(activityC16419x510d00b7);
        editText.setInputType(2);
        editText.setHint("毫秒数，例如 2000");
        long j17 = activityC16419x510d00b7.f229389m;
        editText.setText(j17 == 0 ? "" : java.lang.String.valueOf(j17));
        new android.app.AlertDialog.Builder(activityC16419x510d00b7).setTitle("设置 getAdInfoAsync 超时（ms）").setMessage("0 = 无超时（等到 CGI 回调为止）\n断网测试 fallback 建议 ≥ 5000").setView(editText).setNegativeButton("取消", (android.content.DialogInterface.OnClickListener) null).setPositiveButton("确定", new ic3.a0(editText, activityC16419x510d00b7)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
