package com.tencent.mm.plugin.account.friend.ui;

/* loaded from: classes9.dex */
public class RecoverFriendUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter f73173d = new com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdf;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_session_id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_old_username");
        com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter recoverFriendPresenter = this.f73173d;
        recoverFriendPresenter.f73111h = stringExtra;
        recoverFriendPresenter.f73110g = stringExtra2;
        setMMTitle(com.tencent.mm.R.string.g0s);
        recoverFriendPresenter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "onUICreate");
        recoverFriendPresenter.f73108e = (com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView) recoverFriendPresenter.f73107d.findViewById(com.tencent.mm.R.id.gev);
        gm0.j1.d().a(3513, recoverFriendPresenter);
        android.database.Cursor rawQuery = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().rawQuery("SELECT seq FROM OldAccountFriend WHERE oldUsername = " + d95.b0.O(recoverFriendPresenter.f73110g) + "ORDER BY seq DESC", new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                r2 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
            } finally {
                rawQuery.close();
            }
        }
        recoverFriendPresenter.c(r2);
        recoverFriendPresenter.f73108e.getScrollBar().setVisibility(8);
        recoverFriendPresenter.f73108e.getListView().setOnScrollListener(new r61.a2(recoverFriendPresenter));
        com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView recoverFriendSortView = recoverFriendPresenter.f73108e;
        recoverFriendSortView.f73174s = recoverFriendPresenter.f73110g;
        recoverFriendSortView.setOnItemClickListener(new r61.b2(recoverFriendPresenter));
        recoverFriendPresenter.alive();
        setBackBtn(new s61.w0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter recoverFriendPresenter = this.f73173d;
        recoverFriendPresenter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "onUIDestroy");
        gm0.j1.d().q(3513, recoverFriendPresenter);
        recoverFriendPresenter.dead();
    }
}
