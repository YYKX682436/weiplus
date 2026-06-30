package ee5;

/* loaded from: classes9.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.a3 f333629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(ee5.a3 a3Var) {
        super(1);
        this.f333629d = a3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it instanceof android.widget.TextView) {
            ee5.a3 a3Var = this.f333629d;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = a3Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).O6();
            java.lang.Object tag = ((android.widget.TextView) it).getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) tag).intValue();
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(a3Var.f333350f)) {
                intValue++;
            }
            switch (intValue) {
                case 0:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSearchMemberDetail");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("from_scene", 1);
                    intent.putExtra("RoomInfo_Id", a3Var.f333350f);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, a3Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ic8));
                    j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", intent, null);
                    break;
                case 1:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSearchDateDetail");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("detail_username", a3Var.f333350f);
                    j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, null);
                    break;
                case 2:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeImageVideoHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("kintent_talker", a3Var.f333350f);
                        intent3.putExtra("key_media_type", 1);
                        intent3.putExtra("key_gallery_enter_scene", 4);
                        intent3.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316.class);
                        intent3.addFlags(67108864);
                        a3Var.m158354x19263085().startActivityForResult(intent3, 1);
                        break;
                    } else {
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("kTalker", a3Var.f333350f);
                        intent4.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.q.f283315f.getClass().getName());
                        intent4.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeImageVideoHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(m158354x19263085, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeImageVideoHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 3:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeFileHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("kintent_talker", a3Var.f333350f);
                        intent5.putExtra("key_media_type", 2);
                        android.os.Bundle bundle = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        intent5.putExtra("detail_user_dismiss", a3Var.f333351g);
                        de5.a.f310929a.j(9, 1);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent5, bundle);
                        break;
                    } else {
                        android.content.Intent intent6 = new android.content.Intent();
                        intent6.putExtra("kTalker", a3Var.f333350f);
                        intent6.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.j.f283295f.getClass().getName());
                        intent6.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent6);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(m158354x192630852, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFileHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630852.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(m158354x192630852, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFileHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 4:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeUrlHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent7 = new android.content.Intent();
                        intent7.putExtra("kintent_talker", a3Var.f333350f);
                        intent7.putExtra("key_media_type", 3);
                        android.os.Bundle bundle2 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 2);
                        intent7.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent7, bundle2);
                        break;
                    } else {
                        android.content.Intent intent8 = new android.content.Intent();
                        intent8.putExtra("kTalker", a3Var.f333350f);
                        intent8.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.o.f283309f.getClass().getName());
                        intent8.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(m158354x192630853, arrayList3.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeUrlHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630853.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(m158354x192630853, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeUrlHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 5:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeUrlHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent9 = new android.content.Intent();
                        intent9.putExtra("kintent_talker", a3Var.f333350f);
                        intent9.putExtra("key_media_type", 4);
                        android.os.Bundle bundle3 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 3);
                        intent9.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent9, bundle3);
                        break;
                    } else {
                        android.content.Intent intent10 = new android.content.Intent();
                        intent10.putExtra("kTalker", a3Var.f333350f);
                        intent10.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.r.f283320f.getClass().getName());
                        intent10.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(intent10);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(m158354x192630854, arrayList4.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeMusicHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630854.startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(m158354x192630854, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeMusicHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 6:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeePayHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent11 = new android.content.Intent();
                        intent11.putExtra("kintent_talker", a3Var.f333350f);
                        intent11.putExtra("key_media_type", 5);
                        android.os.Bundle bundle4 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 4);
                        intent11.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent11, bundle4);
                        break;
                    } else {
                        android.content.Intent intent12 = new android.content.Intent();
                        intent12.putExtra("kTalker", a3Var.f333350f);
                        intent12.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.v.f283334f.getClass().getName());
                        intent12.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630855 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(intent12);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(m158354x192630855, arrayList5.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeePayHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630855.startActivity((android.content.Intent) arrayList5.get(0));
                        yj0.a.f(m158354x192630855, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeePayHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 7:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeAppBrandHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent13 = new android.content.Intent();
                        intent13.putExtra("kintent_talker", a3Var.f333350f);
                        intent13.putExtra("key_media_type", 6);
                        android.os.Bundle bundle5 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 5);
                        intent13.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent13, bundle5);
                        break;
                    } else {
                        android.content.Intent intent14 = new android.content.Intent();
                        intent14.putExtra("kTalker", a3Var.f333350f);
                        intent14.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.h.f283289f.getClass().getName());
                        intent14.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630856 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(intent14);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(m158354x192630856, arrayList6.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeAppBrandHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630856.startActivity((android.content.Intent) arrayList6.get(0));
                        yj0.a.f(m158354x192630856, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeAppBrandHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 8:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeFinderFeedHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent15 = new android.content.Intent();
                        intent15.putExtra("kintent_talker", a3Var.f333350f);
                        android.os.Bundle bundle6 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 6);
                        intent15.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI", intent15, bundle6);
                        break;
                    } else {
                        android.content.Intent intent16 = new android.content.Intent();
                        intent16.putExtra("kTalker", a3Var.f333350f);
                        intent16.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.k.f283299f.getClass().getName());
                        intent16.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630857 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(intent16);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(m158354x192630857, arrayList7.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFinderFeedHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630857.startActivity((android.content.Intent) arrayList7.get(0));
                        yj0.a.f(m158354x192630857, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeFinderFeedHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 9:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeShareCardHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent17 = new android.content.Intent();
                        intent17.putExtra("kintent_talker", a3Var.f333350f);
                        intent17.putExtra("key_media_type", 104);
                        android.os.Bundle bundle7 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 8);
                        intent17.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent17, bundle7);
                        break;
                    } else {
                        android.content.Intent intent18 = new android.content.Intent();
                        intent18.putExtra("kTalker", a3Var.f333350f);
                        intent18.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.i.f283292f.getClass().getName());
                        intent18.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630858 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(intent18);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(m158354x192630858, arrayList8.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShareCardHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630858.startActivity((android.content.Intent) arrayList8.get(0));
                        yj0.a.f(m158354x192630858, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShareCardHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 10:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeLocationHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent19 = new android.content.Intent();
                        intent19.putExtra("kintent_talker", a3Var.f333350f);
                        intent19.putExtra("key_media_type", 105);
                        android.os.Bundle bundle8 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 9);
                        intent19.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent19, bundle8);
                        break;
                    } else {
                        android.content.Intent intent20 = new android.content.Intent();
                        intent20.putExtra("kTalker", a3Var.f333350f);
                        intent20.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.p.f283312f.getClass().getName());
                        intent20.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630859 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(intent20);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(m158354x192630859, arrayList9.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeLocationHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x192630859.startActivity((android.content.Intent) arrayList9.get(0));
                        yj0.a.f(m158354x192630859, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeLocationHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 11:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeNoteHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent21 = new android.content.Intent();
                        intent21.putExtra("kintent_talker", a3Var.f333350f);
                        intent21.putExtra("key_media_type", 106);
                        android.os.Bundle bundle9 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 10);
                        intent21.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent21, bundle9);
                        break;
                    } else {
                        android.content.Intent intent22 = new android.content.Intent();
                        intent22.putExtra("kTalker", a3Var.f333350f);
                        intent22.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.s.f283323f.getClass().getName());
                        intent22.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x1926308510 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(intent22);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(m158354x1926308510, arrayList10.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeNoteHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x1926308510.startActivity((android.content.Intent) arrayList10.get(0));
                        yj0.a.f(m158354x1926308510, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeNoteHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 12:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeShopAndProductHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent23 = new android.content.Intent();
                        intent23.putExtra("kintent_talker", a3Var.f333350f);
                        intent23.putExtra("key_media_type", 102);
                        android.os.Bundle bundle10 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 11);
                        intent23.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent23, bundle10);
                        break;
                    } else {
                        android.content.Intent intent24 = new android.content.Intent();
                        intent24.putExtra("kTalker", a3Var.f333350f);
                        intent24.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.u.f283331f.getClass().getName());
                        intent24.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x1926308511 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        arrayList11.add(intent24);
                        java.util.Collections.reverse(arrayList11);
                        yj0.a.d(m158354x1926308511, arrayList11.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShopAndProductHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x1926308511.startActivity((android.content.Intent) arrayList11.get(0));
                        yj0.a.f(m158354x1926308511, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeShopAndProductHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 13:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeGiftHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent25 = new android.content.Intent();
                        intent25.putExtra("kintent_talker", a3Var.f333350f);
                        intent25.putExtra("key_media_type", 103);
                        android.os.Bundle bundle11 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 12);
                        intent25.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent25, bundle11);
                        break;
                    } else {
                        android.content.Intent intent26 = new android.content.Intent();
                        intent26.putExtra("kTalker", a3Var.f333350f);
                        intent26.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.l.f283303f.getClass().getName());
                        intent26.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x1926308512 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        arrayList12.add(intent26);
                        java.util.Collections.reverse(arrayList12);
                        yj0.a.d(m158354x1926308512, arrayList12.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeGiftHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x1926308512.startActivity((android.content.Intent) arrayList12.get(0));
                        yj0.a.f(m158354x1926308512, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeGiftHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                case 14:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "onSeeEmojiHistory");
                    if (!a3Var.O6()) {
                        android.content.Intent intent27 = new android.content.Intent();
                        intent27.putExtra("kintent_talker", a3Var.f333350f);
                        android.os.Bundle bundle12 = !com.p314xaae8f345.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(a3Var.m158354x19263085(), new android.util.Pair[0]).toBundle() : null;
                        de5.a.f310929a.j(9, 7);
                        intent27.putExtra("detail_user_dismiss", a3Var.f333351g);
                        j45.l.u(a3Var.m158354x19263085(), "com.tencent.mm.ui.chatting.gallery.EmojiHistoryListUI", intent27, bundle12);
                        break;
                    } else {
                        android.content.Intent intent28 = new android.content.Intent();
                        intent28.putExtra("kTalker", a3Var.f333350f);
                        intent28.putExtra("kDefaultType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.t.f283326f.getClass().getName());
                        intent28.setClass(a3Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x1926308513 = a3Var.m158354x19263085();
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        arrayList13.add(intent28);
                        java.util.Collections.reverse(arrayList13);
                        yj0.a.d(m158354x1926308513, arrayList13.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeEmojiHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x1926308513.startActivity((android.content.Intent) arrayList13.get(0));
                        yj0.a.f(m158354x1926308513, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "onSeeEmojiHistory", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
            }
        }
        return jz5.f0.f384359a;
    }
}
