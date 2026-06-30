package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public abstract class ea {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f289188a;

    public static void a(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("show_rating_preferences", 0);
        int i17 = sharedPreferences.getInt("show_rating_wait_days", 0);
        int i18 = sharedPreferences.getInt("show_rating_first_second_time", 0);
        f289188a = db5.e1.K(context, false, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j57), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574691j56), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574690j55), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ca(sharedPreferences, context, i18, i17), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.da(sharedPreferences, i18, i17));
    }

    public static void b(android.content.Context context, boolean z17) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("show_rating_preferences", 0);
        boolean z18 = sharedPreferences.getBoolean("show_rating_again", false);
        int i17 = sharedPreferences.getInt("show_rating_wait_days", 0);
        int i18 = sharedPreferences.getInt("show_rating_first_second_time", 0);
        if (z17) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574688j53);
            string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574687j52);
            string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574686j51);
        } else {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574685j50);
            string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4z);
            string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4y);
        }
        f289188a = db5.e1.K(context, false, string, "", string2, string3, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.aa(sharedPreferences, context, z18, i18, i17), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ba(sharedPreferences, z18, i18, i17));
    }
}
