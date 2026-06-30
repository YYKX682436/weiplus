package lo2;

/* loaded from: classes8.dex */
public final class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f f401707d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f) {
        this.f401707d = activityC14485xd3a2499f;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        new android.content.Intent().putExtra("key_is_delete", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f = this.f401707d;
        activityC14485xd3a2499f.setResult(-1, activityC14485xd3a2499f.getIntent());
        activityC14485xd3a2499f.finish();
    }
}
