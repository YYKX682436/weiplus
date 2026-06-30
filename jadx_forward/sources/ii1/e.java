package ii1;

/* loaded from: classes7.dex */
public class e implements android.widget.RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f373149a;

    public e(android.content.Context context) {
        this.f373149a = context;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        java.util.List list = hi1.o.f363033c.f363034a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getLoadingView() {
        return new android.widget.RemoteViews(this.f373149a.getPackageName(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569655hr);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getViewAt(int i17) {
        hi1.o oVar = hi1.o.f363033c;
        java.util.List list = oVar.f363034a;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return null;
        }
        hi1.m mVar = (hi1.m) oVar.f363034a.get(i17);
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.f373149a.getPackageName(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569655hr);
        remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pmf, mVar.f363030b);
        remoteViews.setImageViewBitmap(com.p314xaae8f345.mm.R.id.pme, oVar.f363035b[i17]);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_item", mVar.f363029a);
        intent.putExtra("extra_action", "action_click_item");
        remoteViews.setOnClickFillInIntent(com.p314xaae8f345.mm.R.id.pme, intent);
        remoteViews.setOnClickFillInIntent(com.p314xaae8f345.mm.R.id.pmf, intent);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("extra_action", "action_click_bg");
        remoteViews.setOnClickFillInIntent(com.p314xaae8f345.mm.R.id.pmd, intent2);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onCreate");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onDataSetChanged");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onDestroy");
        hi1.o oVar = hi1.o.f363033c;
        if (oVar.f363034a != null) {
            oVar.f363034a = null;
        }
    }
}
