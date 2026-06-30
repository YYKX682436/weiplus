package s92;

/* loaded from: classes2.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            r6 = this;
            android.content.Intent r0 = s92.b.f486524b
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r2 = "key_activity_jump_info_list"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L14
            java.util.List r0 = (java.util.List) r0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L4d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r0.next()
            byte[] r3 = (byte[]) r3
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r4.<init>()
            if (r3 != 0) goto L34
            goto L45
        L34:
            r4.mo11468x92b714fd(r3)     // Catch: java.lang.Exception -> L38
            goto L46
        L38:
            r3 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "safeParser"
            java.lang.String r5 = ""
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r5, r3)
        L45:
            r4 = r1
        L46:
            if (r4 == 0) goto L20
            r2.add(r4)
            goto L20
        L4c:
            r1 = r2
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s92.a.a():java.util.List");
    }

    public final void b(android.content.Intent intent, android.content.Intent intent2) {
        int intExtra = intent.getIntExtra("key_activity_type", 0);
        boolean booleanExtra = intent.getBooleanExtra("saveActivity", false);
        if (intExtra == 102 && booleanExtra) {
            intent2.putExtra("saveActivity", true);
            intent2.putExtra("key_activity_type", 102);
            java.lang.String stringExtra = intent.getStringExtra("key_user_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent2.putExtra("key_user_name", stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("key_nick_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            intent2.putExtra("key_nick_name", stringExtra2);
            java.lang.String stringExtra3 = intent.getStringExtra("key_cover_url");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            intent2.putExtra("key_cover_url", stringExtra3);
            java.lang.String stringExtra4 = intent.getStringExtra("key_avatar_url");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            intent2.putExtra("key_avatar_url", stringExtra4);
            intent2.putExtra("key_topic_id", intent.getLongExtra("key_topic_id", 0L));
            java.lang.String stringExtra5 = intent.getStringExtra("key_activity_name");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            intent2.putExtra("key_activity_name", stringExtra5);
            java.lang.String stringExtra6 = intent.getStringExtra("key_activity_desc");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            intent2.putExtra("key_activity_desc", stringExtra6);
            java.lang.String stringExtra7 = intent.getStringExtra("key_activity_post_wording");
            intent2.putExtra("key_activity_post_wording", stringExtra7 != null ? stringExtra7 : "");
            intent2.putExtra("key_activity_end_time", intent.getLongExtra("key_activity_end_time", 0L));
            intent2.putExtra("key_activity_src_type", "key_scene_from_profile");
            java.io.Serializable serializableExtra = intent.getSerializableExtra("key_activity_jump_info_list");
            if (serializableExtra != null) {
                intent2.putExtra("key_activity_jump_info_list", serializableExtra);
            }
            intent2.putExtra("key_activity_display_mask", intent.getLongExtra("key_activity_display_mask", 0L));
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_wording_info");
            if (byteArrayExtra != null) {
                intent2.putExtra("key_wording_info", byteArrayExtra);
            }
        }
    }
}
